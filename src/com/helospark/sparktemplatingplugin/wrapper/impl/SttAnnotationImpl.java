package com.helospark.sparktemplatingplugin.wrapper.impl;

import java.util.Arrays;
import java.util.List;

import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.JavaModelException;

import com.helospark.sparktemplatingplugin.wrapper.SttAnnotation;
import com.helospark.sparktemplatingplugin.wrapper.SttJavaProject;

public class SttAnnotationImpl extends SttJavaElementImpl<IAnnotation> implements SttAnnotation {

    public SttAnnotationImpl(IAnnotation annotation) {
        super(annotation);
    }

    @Override
    public String getAttachedJavadoc() throws JavaModelException {
        return wrappedElement.getAttachedJavadoc(progressMonitor);
    }

    @Override
    public String getElementName() {
        return wrappedElement.getElementName();
    }

    @Override
    public SttJavaProject getJavaProject() {
        return new SttJavaProjectImpl(wrappedElement.getJavaProject());
    }

    @Override
    public List<IMemberValuePair> getMemberValuePairs() throws JavaModelException {
        return Arrays.asList(wrappedElement.getMemberValuePairs());
    }

    @Override
    public String getSource() throws JavaModelException {
        return wrappedElement.getSource();
    }
}
