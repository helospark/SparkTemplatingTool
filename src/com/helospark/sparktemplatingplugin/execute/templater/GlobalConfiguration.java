package com.helospark.sparktemplatingplugin.execute.templater;

public class GlobalConfiguration implements ScriptExposed, StatefulBean {
    public static final String SCRIPT_NAME = "globalConfig";
    private static final boolean DEFAULT_APPEND_NEW_LINE_VALUE = false;
    private boolean appendNewLine = DEFAULT_APPEND_NEW_LINE_VALUE;

    @Override
    public String getExposedName() {
        return SCRIPT_NAME;
    }

    public boolean isAppendNewLine() {
        return appendNewLine;
    }

    public void setAppendNewLine(boolean appendNewLine) {
        this.appendNewLine = appendNewLine;
    }

    @Override
    public void resetState() {
        appendNewLine = DEFAULT_APPEND_NEW_LINE_VALUE;
    }

}
