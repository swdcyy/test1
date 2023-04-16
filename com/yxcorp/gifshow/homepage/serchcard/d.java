package com.yxcorp.gifshow.homepage.serchcard.d;
import java.lang.Object;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.util.List;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.homepage.serchcard.d$a;

public class d	// class@0017fc
{
    public b a;
    public SearchCardMeta b;
    public d$a c;
    public int d;
    public long e;
    public Set f;
    public long g;
    public String h;
    public Map i;
    public QPhoto j;
    public final List k;

    public void d(){
       super();
       this.d = -1;
       this.e = 0;
       this.f = new HashSet();
       this.g = 0;
       this.i = new HashMap();
       this.k = new ArrayList();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       this.d = -1;
       this.e = 0;
       this.f.clear();
       this.k.clear();
       return;
    }
    public int b(){
       return this.d;
    }
    public long c(){
       return this.e;
    }
    public SearchCardMeta d(){
       return this.b;
    }
    public QPhoto e(){
       return this.j;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       b9.a(this.a);
       return;
    }
    public void g(int p0){
       this.d = p0;
    }
    public void h(long p0){
       this.e = p0;
    }
    public void i(String p0){
       if (this.d >= null) {
          this.h = p0;
       }
       return;
    }
    public void j(long p0){
       if (this.d >= null) {
          this.g = p0;
       }
       return;
    }
    public void k(d$a p0){
       this.c = p0;
    }
}
