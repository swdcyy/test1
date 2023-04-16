package com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory;
import zk.j;
import java.lang.Object;
import el.a;
import java.lang.Class;
import zk.i;
import com.google.gson.b;
import bl.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Type;
import com.google.gson.internal.bind.TreeTypeAdapter;

public final class TreeTypeAdapter$SingleTypeFactory implements j	// class@000586
{
    public final a b;
    public final boolean c;
    public final Class d;
    public final i e;
    public final b f;

    public void TreeTypeAdapter$SingleTypeFactory(Object p0,a p1,boolean p2,Class p3){
       boolean b;
       super();
       b uob = null;
       i oi = (p0 instanceof i)? p0: uob;
       this.e = oi;
       if (p0 instanceof b) {
          uob = p0;
       }
       this.f = uob;
       b = (oi != null || uob != null)? true: false;
       a.a(b);
       this.b = p1;
       this.c = p2;
       this.d = p3;
       return;
    }
    public TypeAdapter a(Gson p0,a p1){
       TreeTypeAdapter treeTypeAdap;
       TreeTypeAdapter$SingleTypeFactory tb = this.b;
       if (tb != null) {
          treeTypeAdap = (tb.equals(p1) || (this.c != null && this.b.getType() == p1.getRawType()))? 1: null;
       }else {
          treeTypeAdap = this.d.isAssignableFrom(p1.getRawType());
       }
       if (treeTypeAdap) {
          TreeTypeAdapter treeTypeAdap1 = new TreeTypeAdapter(this.e, this.f, p0, p1, this);
       }else {
          TypeAdapter typeAdapter = null;
       }
       return treeTypeAdap;
    }
}
