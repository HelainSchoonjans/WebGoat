package org.dummy.insecure.framework;

import java.io.IOException;
import org.owasp.webgoat.deserialization.SerializationHelper;

class MyApp {
    public static void main(String[] args) throws IOException {
        VulnerableTaskHolder vulnerableTaskHolder = new VulnerableTaskHolder("wait", "sleep 5");

        System.out.println(SerializationHelper.toString(vulnerableTaskHolder)); // Display the string.
    }
}