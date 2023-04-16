package com.vivo.push.p;
import java.lang.String;
import android.net.Uri;

public final class p	// class@001090
{
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;

    static {
       p.a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");
       p.b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");
       p.c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");
       p.d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");
    }
    public static String a(int p0){
       switch (p0){
           case 2002:
             return "method_alias_bind";
           case 2003:
             return "method_alias_unbind";
           case 2004:
             return "method_tag_bind";
           case 2005:
             return "method_tag_unbind";
           case 2006:
             return "method_sdk_bind";
           case 2007:
             return "method_sdk_unbind";
           case 2008:
             return "method_stop";
           default:
             return null;
       }
    }
}
