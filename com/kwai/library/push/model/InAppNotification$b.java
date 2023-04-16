package com.kwai.library.push.model.InAppNotification$b;
import java.lang.Object;
import com.kwai.library.push.channel.bean.PRIORITY;
import com.kwai.library.push.model.PushViewStyle;
import com.kwai.library.push.model.InAppNotification;
import java.lang.String;
import java.util.UUID;
import com.kwai.library.push.model.InAppNotification$a;
import com.kwai.library.push.channel.bean.DataConf;
import java.lang.CharSequence;
import java.util.Map;
import java.util.ArrayList;

public class InAppNotification$b	// class@0008d3
{
    public PRIORITY a;
    public PushViewStyle b;
    public String c;
    public String d;
    public String e;
    public String f;
    public CharSequence g;
    public CharSequence h;
    public String i;
    public String j;
    public List k;
    public List l;
    public Map m;
    public String n;
    public String o;
    public DataConf p;
    public JsonObject q;
    public Shake r;
    public Sound s;
    public ViewStyle t;
    public boolean u;
    public String v;
    public boolean w;

    public void InAppNotification$b(){
       super();
       this.a = PRIORITY.NORMAL;
       this.b = PushViewStyle.NORMAL;
       this.v = "0";
    }
    public InAppNotification a(){
       InAppNotification$b tn = this.n;
       if (tn == null || tn.isEmpty()) {
          this.n = UUID.randomUUID().toString();
       }
       return new InAppNotification(this, null);
    }
    public InAppNotification$b b(String p0){
       this.j = p0;
       return this;
    }
    public InAppNotification$b c(String p0){
       this.f = p0;
       return this;
    }
    public InAppNotification$b d(String p0){
       this.c = p0;
       return this;
    }
    public InAppNotification$b e(DataConf p0){
       this.p = p0;
       return this;
    }
    public InAppNotification$b f(CharSequence p0){
       this.h = p0;
       return this;
    }
    public InAppNotification$b g(Map p0){
       this.m = p0;
       return this;
    }
    public InAppNotification$b h(String p0){
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p0);
       this.k = uArrayList;
       return this;
    }
    public InAppNotification$b i(String p0){
       this.i = p0;
       return this;
    }
    public InAppNotification$b j(PushViewStyle p0){
       this.b = p0;
       return this;
    }
    public InAppNotification$b k(CharSequence p0){
       this.g = p0;
       return this;
    }
}
