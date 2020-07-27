package com.wanjian.cockroach;

import java.util.regex.Pattern;

/*
 * Created by shen jian jun on 2020-07-07
 */
public class UnableHandleError {
    public Pattern className;
    public Pattern fileName;
    public Pattern methodName;

    public UnableHandleError() {
    }

    public UnableHandleError(String className, String fileName, String methodName) {
        if (className != null) {
            this.className = Pattern.compile(className);
        }
        if (fileName != null) {
            this.fileName = Pattern.compile(fileName);
        }
        if (methodName != null) {
            this.methodName = Pattern.compile(methodName);
        }
    }
}