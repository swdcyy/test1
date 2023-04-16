package com.kuaishou.webkit.LegacyErrorStrings;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.CharSequence;

public class LegacyErrorStrings	// class@001251
{

    public void LegacyErrorStrings(){
       super();
    }
    public static int getResource(int p0){
       return 0;
    }
    public static String getString(int p0,Context p1){
       return p1.getText(LegacyErrorStrings.getResource(p0)).toString();
    }
}
