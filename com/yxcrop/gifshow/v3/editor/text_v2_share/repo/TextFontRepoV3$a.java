package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3$a;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import brd.v;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import d0c.a;
import bod.a;
import bod.b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collection;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import brd.g;

public final class TextFontRepoV3$a implements g	// class@000bdb
{
    public final TextFontRepoV3 b;
    public final v c;

    public void TextFontRepoV3$a(TextFontRepoV3 p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextFontRepoV3$a.class, "1")) {
       }else {
          a.o(p0, "it");
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          Iterator iterator = p0.iterator();
          boolean b = false;
          while (iterator.hasNext()) {
             uArrayList.add(b.a(new a(iterator.next(), "", b)));
          }
          this.b.d.clear();
          this.b.d.addAll(uArrayList);
          Object[] objArray = new Object[b];
          a.D().w("TextFontRepo", "loadFontConfig size: "+p0.size()+' '+p0, objArray);
          this.c.onNext(uArrayList);
          this.c.onComplete();
       }
       return;
    }
}
