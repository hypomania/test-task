package org.example.testtask.exceptions;

import org.example.testtask.entity.VulnerabilityScript;

public class CircularDependenciesException extends Exception {

    private VulnerabilityScript lastScript;

    public CircularDependenciesException(VulnerabilityScript script) {
        lastScript = script;
    }

    public CircularDependenciesException(String message, VulnerabilityScript script) {
        super(message);
        lastScript = script;
    }
}
