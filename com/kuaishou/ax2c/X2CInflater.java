package com.kuaishou.ax2c.X2CInflater;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import java.lang.Object;
import android.view.View;
import java.lang.Integer;
import com.kuaishou.ax2c.IViewCreator;
import android.content.res.Resources;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kuaishou.ax2c.X2CInflater$DefaultCreator;
import com.kuaishou.ax2c.X2CInflater$1;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.view.InflateException;
import java.lang.IllegalArgumentException;

public class X2CInflater	// class@000fc6
{
    public Context context;
    public static final ConcurrentHashMap sSparseArray;

    static {
       X2CInflater.sSparseArray = new ConcurrentHashMap();
    }
    public void X2CInflater(Context p0){
       super();
       this.context = p0;
    }
    public View getView(int p0){
       IViewCreator iViewCreator = X2CInflater.sSparseArray.get(Integer.valueOf(p0));
       if (iViewCreator == null) {
          try{
             String resourceName = this.context.getResources().getResourceName(p0);
             iViewCreator = this.context.getClassLoader().loadClass("com.kuaishou.ax2c.X2C_"+resourceName.substring((resourceName.lastIndexOf("/") + 1))).newInstance();
          }catch(java.lang.Exception e0){
          }
          if (e0 == null) {
             iViewCreator = new X2CInflater$DefaultCreator(null);
          }
          X2CInflater.sSparseArray.put(Integer.valueOf(p0), iViewCreator);
       }
       return iViewCreator.createView(this.context);
    }
    public View inflate(int p0,ViewGroup p1,boolean p2){
       if (this.context == null) {
          throw new IllegalArgumentException("Context must not be null");
       }
       View view = this.getView(p0);
       if (view != null) {
          int i = 0x4000000;
          if (view.getTag(i) != null && view.getTag(i).equals("MergeTag")) {
             if (p1 != null && p2) {
                View view1 = view;
                i = view1.getChildCount();
                ArrayList uArrayList = new ArrayList();
                int i1 = 0;
                for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                   uArrayList.add(view1.getChildAt(i2));
                }
                view1.removeAllViews();
                for (; i1 < i; i1 = i1 + 1) {
                   p1.addView(uArrayList.get(i1));
                }
             }else {
                throw new InflateException("<merge /> can be used only with a valid ViewGroup root and attachToRoot=true");
             }
          }else if(p1 != null && p2){
             p1.addView(view);
          }
       }
       return view;
    }
}
