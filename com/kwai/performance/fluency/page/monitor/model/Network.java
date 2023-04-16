package com.kwai.performance.fluency.page.monitor.model.Network;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import kotlin.jvm.internal.a;

public final class Network	// class@0010c0
{
    public int a;
    public String api;
    public List b;
    public boolean c;
    public int hookType;

    public void Network(){
       super();
       this.api = "";
       this.b = new ArrayList();
    }
    public final String a(){
       return this.api;
    }
    public final List b(){
       return this.b;
    }
    public final void c(int p0){
       this.a = p0;
    }
    public final void d(List p0){
       a.p(p0, "<set-?>");
       this.b = p0;
    }
}
