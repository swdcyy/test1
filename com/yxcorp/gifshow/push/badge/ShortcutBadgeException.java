package com.yxcorp.gifshow.push.badge.ShortcutBadgeException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import nsd.u;

public final class ShortcutBadgeException extends Exception	// class@00161a
{

    public void ShortcutBadgeException(String p0,Exception p1){
       super(p0, p1);
    }
    public void ShortcutBadgeException(String p0,Exception p1,int p2,u p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       super(p0, p1);
       return;
    }
}
