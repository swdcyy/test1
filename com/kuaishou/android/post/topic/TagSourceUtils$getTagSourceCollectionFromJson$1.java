package com.kuaishou.android.post.topic.TagSourceUtils$getTagSourceCollectionFromJson$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import pq.a;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonElement;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.gson.JsonArray;
import java.lang.Iterable;
import java.util.Iterator;
import fg6.a;
import pq.b;
import com.google.gson.Gson;

public final class TagSourceUtils$getTagSourceCollectionFromJson$1 extends Lambda implements p	// class@000ec2
{
    public final a $tagSourceMap;

    public void TagSourceUtils$getTagSourceCollectionFromJson$1(a p0){
       this.$tagSourceMap = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1);
       return l1.a;
    }
    public final void invoke(String p0,JsonElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TagSourceUtils$getTagSourceCollectionFromJson$1.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "sourceListElement");
       if (p1 instanceof JsonArray) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             b uob = a.a.c(iterator.next(), b.class);
             if (uob != null) {
                a.d(this.$tagSourceMap, p0, uob.b(), uob.a(), false, 8, null);
             }
          }
       }
       return;
    }
}
