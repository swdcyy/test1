package com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider$b;
import erd.g;
import com.yxcorp.gifshow.v3.editor.effectv2.network.EffectMagicDataProvider;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.MagicEmojiResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import lqc.g;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import dqc.c;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import kotlin.collections.ArraysKt___ArraysKt;
import com.yxcorp.gifshow.v3.editor.effect.model.EffectGroupType;
import brd.g;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public final class EffectMagicDataProvider$b implements g	// class@000f4d
{
    public final EffectMagicDataProvider b;
    public final v c;

    public void EffectMagicDataProvider$b(EffectMagicDataProvider p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       EffectMagicDataProvider obj3;
       g a;
       c obj4;
       SimpleMagicFace mId;
       int i2;
       SimpleMagicFace mName;
       List list;
       Object obj5;
       Object obj = this;
       MagicEmoji obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, EffectMagicDataProvider$b.class, "1")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w("EffectMagicDataProvider", "loadDataList done", objArray);
          MagicEmojiResponse mMagicEmojis = obj1.mMagicEmojis;
          int i1 = (mMagicEmojis != null)? mMagicEmojis.size(): 0;
          if (i1 > 0) {
             ArrayList uArrayList = new ArrayList();
             obj1 = obj1.mMagicEmojis.get(i).mMagicFaces;
             if (obj1 != null) {
                Iterator iterator = obj1.iterator();
                Object obj2 = null;
                while (iterator.hasNext()) {
                   obj3 = iterator.next();
                   a = g.a;
                   Objects.requireNonNull(a);
                   obj4 = PatchProxy.applyOneRefs(obj3, a, g.class, "5");
                   if (obj4 != PatchProxyResult.class) {
                      obj2 = obj4;
                   }else if(obj3 == null){
                      mId = obj3.mId;
                      a.o(mId, "magicFace.mId");
                      i2 = Integer.parseInt(mId);
                      mName = obj3.mName;
                      a.o(mName, "magicFace.mName");
                      mId = obj3.mImages;
                      a.o(mId, "magicFace.mImages");
                      list = ArraysKt___ArraysKt.Ey(mId);
                      obj4 = new c(obj3, "", a.e(obj3), i2, mName, list, "magic", EffectGroupType.MAGIC_EMOJI_EFFECT, obj3.mDefaultDuration);
                   }
                   if (obj2 != null) {
                      uArrayList.add(obj2);
                   }
                }
                EffectMagicDataProvider b = obj.b.b;
                if (b != null) {
                   Iterator iterator1 = obj1.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         obj5 = iterator1.next();
                         if (!a.g(obj5.mId, b.mId)) {
                            continue ;
                         }
                      }else {
                         obj5 = obj2;
                      }
                      c uoc = (obj5 == null)? 1: null;
                      obj3 = (uoc)? b: obj2;
                      if (obj3 != null) {
                         SimpleMagicFace mId1 = obj3.mId;
                         a.o(mId1, "face.mId");
                         i2 = Integer.parseInt(mId1);
                         mName = obj3.mName;
                         a.o(mName, "face.mName");
                         mId1 = obj3.mImages;
                         a.o(mId1, "face.mImages");
                         list = ArraysKt___ArraysKt.Ey(mId1);
                         obj4 = new c(obj3, "", g.a.e(obj3), i2, mName, list, "magic", EffectGroupType.MAGIC_EMOJI_EFFECT, obj3.mDefaultDuration);
                         uArrayList.add(i, uoc);
                      }
                   }
                }
             }
             obj.c.onNext(uArrayList);
             obj.c.onComplete();
          }else {
             obj.c.onError(new IllegalStateException("list fetch empty"));
          }
       }
       return;
    }
}
