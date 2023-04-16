package com.ta.utdid2.a.a.c;
import android.os.Build$VERSION;
import java.lang.String;

public class c	// class@000cc0
{

    public static boolean a(){
       boolean b = true;
       if (Build$VERSION.SDK_INT < 29) {
          String cODENAME = Build$VERSION.CODENAME;
          if (cODENAME.length() != b || (cODENAME.charAt(0) < 'Q' || cODENAME.charAt(0) > 'Z')) {
             b = false;
          }
       }
       return b;
    }
}
