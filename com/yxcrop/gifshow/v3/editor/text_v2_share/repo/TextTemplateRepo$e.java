package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$e;
import erd.g;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import bod.d;
import nuc.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import orc.f;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collection;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class TextTemplateRepo$e implements g	// class@000bf2
{
    public final TextTemplateRepo b;

    public void TextTemplateRepo$e(TextTemplateRepo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       f a;
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepo$e.class, "1")) {
       }else {
          boolean b = false;
          this.b.h = b;
          a.o(p0, "it");
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next().k().r();
             if (!TextUtils.isEmpty(str)) {
                a = f.a;
                a.o(a, "TextIdFeatureIdConverter.TEXT_ID_FEATURE_ID_MAP");
                FeatureId$b uob = FeatureId.newBuilder();
                uob.a(str);
                a.put(str, uob.build());
             }
          }
          this.b.f.clear();
          this.b.f.addAll(p0);
          Object[] objArray = new Object[b];
          a.D().w("TextTemplateRepo", "fetch Config size: "+p0.size()+' '+p0, objArray);
          this.b.k(p0);
       }
       return;
    }
}
