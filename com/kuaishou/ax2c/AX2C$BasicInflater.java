package com.kuaishou.ax2c.AX2C$BasicInflater;
import com.kuaishou.ax2c.LayoutInflaterDelegate;
import android.view.LayoutInflater;
import java.lang.String;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.util.AttributeSet;

public class AX2C$BasicInflater extends LayoutInflater implements LayoutInflaterDelegate	// class@000fad
{
    public static final String[] sClassPrefixList;

    static {
       String[] stringArray = new String[]{"android.widget.","android.webkit.","android.app."};
       AX2C$BasicInflater.sClassPrefixList = stringArray;
    }
    public void AX2C$BasicInflater(Context p0){
       super(p0);
    }
    public LayoutInflater cloneInContext(Context p0){
       return new AX2C$BasicInflater(p0);
    }
    public View inflate(Context p0,int p1,ViewGroup p2,boolean p3){
       return a.c(this, p1, p2, p3);
    }
    public View onCreateView(String p0,AttributeSet p1){
       View view;
       String[] sClassPrefix = AX2C$BasicInflater.sClassPrefixList;
       int len = sClassPrefix.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return super.onCreateView(p0, p1);
          }
          object oobject = sClassPrefix[i];
          try{
             view = this.createView(p0, oobject, p1);
             if (view != null) {
                break ;
             }else {
                i = i + 1;
             }
          }catch(java.lang.ClassNotFoundException e0){
          }
       }
       return view;
    }
}
