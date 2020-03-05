/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2019 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.jpeek;

import com.jcabi.xml.XML;
import java.io.IOException;
import java.util.Map;

/**
 * Metrics calculus interface.
 * @since 0.30.9
 * @todo #397:30min We start having the infrastructure for graph building from skeleton.
 *  The graph have just nodes for now without any connection between them.
 *  We should continue to build nodes connections to reflect methods (inter-)calls.
 *  After that, we should continue to implement an LCOM4 metrics calculus based on the graph.
 */
public interface Calculus {

    /**
     * Produces {@link XML} representing metrics values.
     * @param metric Desired metric to calculate
     * @param params Params
     * @param skeleton Package input
     * @return XML document giving metrics values for classes
     * @throws IOException If fails
     */
    XML node(String metric, Map<String, Object> params, XML skeleton)
        throws IOException;

}