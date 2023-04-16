package com.cmic.sso.sdk.e.p;
import java.lang.String;
import java.util.Date;
import java.lang.System;
import java.text.SimpleDateFormat;

public class p	// class@000f6d
{

    public static String a(){
       return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date(System.currentTimeMillis()));
    }
}
