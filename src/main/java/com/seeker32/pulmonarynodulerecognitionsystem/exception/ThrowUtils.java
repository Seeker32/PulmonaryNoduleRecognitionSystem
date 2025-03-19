package com.seeker32.pulmonarynodulerecognitionsystem.exception;

/**
 * 异常处理工具类
 *
 * @author Seeker32
 * @CreateTime: 2025-03-19
 */
public class ThrowUtils {

    /**
     * 条件成立则抛出异常
     *
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 条件成立则抛出异常
     *
     * @param condition
     * @param errorCode
     */
    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    /**
     * 条件成立则抛出异常
     *
     * @param condition
     * @param errorCode
     * @param message
     */
    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition,new BusinessException(errorCode, message));
    }
}
