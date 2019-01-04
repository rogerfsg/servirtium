/*
        SvHTTP: Service Virtualized HTTP

        Copyright (c) 2018, Paul Hammant
        All rights reserved.

        Redistribution and use in source and binary forms, with or without
        modification, are permitted provided that the following conditions are met:

        1. Redistributions of source code must retain the above copyright notice, this
        list of conditions and the following disclaimer.
        2. Redistributions in binary form must reproduce the above copyright notice,
        this list of conditions and the following disclaimer in the documentation
        and/or other materials provided with the distribution.

        THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
        ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
        WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
        DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
        ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
        (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
        LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
        ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
        (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
        SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

        The views and conclusions contained in the software and documentation are those
        of the authors and should not be interpreted as representing official policies,
        either expressed or implied, of the SvHTTP project.
*/

package com.paulhammant.svhttp;

import com.paulhammant.svhttp.svn.SvnHeaderManipulator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.paulhammant.svhttp.SubversionCheckoutRecorderTest.CHECKOUT_RECORDER_TEST_MD;
import static com.paulhammant.svhttp.SubversionCheckoutRecorderTest.createWorkDirAndDeleteCheckout;

public class SubversionCheckoutReplayTest {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Run this main() method from within Intellij

        // Or in the root of this project,
        // do mvn jooby:run

        // then run the following command on the command line (same directory)
        // svn --config-option servers:global:http-proxy-host=localhost --config-option servers:global:http-proxy-port=8099 co http://svn.apache.org/repos/asf/synapse/tags/3.0.0/modules/distribution/src/main/conf/ .svnhttp_tmp/conf

        ServiceInteractionReplayer replayer = new ServiceInteractionReplayer(
                8099, false, new SvnHeaderManipulator("", ""));
        replayer.setPlaybackFilename(CHECKOUT_RECORDER_TEST_MD);
        replayer.startApp();

        String tempDir = new File(".").getAbsolutePath() + "/.svhttp_tmp/";
        createWorkDirAndDeleteCheckout(tempDir);

    }

}
