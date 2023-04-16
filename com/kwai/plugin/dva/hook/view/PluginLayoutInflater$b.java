package com.kwai.plugin.dva.hook.view.PluginLayoutInflater$b;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater;
import android.view.LayoutInflater;
import android.content.Context;
import java.lang.String;
import com.kwai.plugin.dva.hook.view.PluginLayoutInflater$a;
import ej7.a;
import android.view.LayoutInflater$Factory2;

public class PluginLayoutInflater$b extends PluginLayoutInflater	// class@001345
{

    public void PluginLayoutInflater$b(LayoutInflater p0,Context p1,String p2,PluginLayoutInflater$a p3){
       super(p0, p1, p2);
       this.setFactory2(new a(p2, this));
    }
}
