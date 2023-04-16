package com.kwai.plugin.dva.hook.view.PluginLayoutInflater;
import android.view.LayoutInflater;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater$b;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater$a;
import android.util.AttributeSet;
import android.view.View;
import android.util.Pair;

public class PluginLayoutInflater extends LayoutInflater	// class@001346
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"android.widget.","android.webkit.","android.app."};
       PluginLayoutInflater.a = stringArray;
    }
    public void PluginLayoutInflater(LayoutInflater p0,Context p1){
       super(p0, p1);
    }
    public void PluginLayoutInflater(LayoutInflater p0,Context p1,String p2){
       super(p0, p1);
    }
    public static PluginLayoutInflater build(LayoutInflater p0,Context p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, PluginLayoutInflater.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PluginLayoutInflater(new PluginLayoutInflater$b(p0, p1, p2, null), p1, p2);
    }
    public LayoutInflater cloneInContext(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginLayoutInflater.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PluginLayoutInflater(this, p0);
    }
    public View onCreateView(String p0,AttributeSet p1){
       View view;
       String[] obj = PatchProxy.applyTwoRefs(p0, p1, this, PluginLayoutInflater.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PluginLayoutInflater.a;
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return super.onCreateView(p0, p1);
          }
          object oobject = obj[i];
          try{
             Pair pair = new Pair(p0, oobject);
             view = this.createView(pair.first, pair.second, p1);
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
