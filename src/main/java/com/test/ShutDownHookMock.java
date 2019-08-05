package com.test;

import java.util.concurrent.TimeUnit;

public class ShutDownHookMock {

    private static final ShutDownHookMock MGR = new ShutDownHookMock();

    private static final long TIMEOUT_DEFAULT = 10;
    private static final TimeUnit TIME_UNIT_DEFAULT = TimeUnit.SECONDS;

    private ShutDownHookMock(){}
    public static ShutDownHookMock get(){ return MGR;}

}
