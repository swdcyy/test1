package com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment$a;
import s2b.a;
import com.yxcorp.gifshow.music.cloudmusic.common.CategoryMusicFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.cloudmusic.common.b;
import java.util.Collection;
import ekd.q$b;
import ekd.q;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import kob.n;
import androidx.fragment.app.Fragment;
import com.google.gson.JsonObject;
import jqb.k;
import k2b.e0;

public class CategoryMusicFragment$a implements a	// class@001ffc
{
    public final CategoryMusicFragment a;

    public void CategoryMusicFragment$a(CategoryMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CategoryMusicFragment$a.class, "1")) {
          return;
       }
       CategoryMusicFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, CategoryMusicFragment.class, "3")) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj instanceof Music) {
                uArrayList.add(obj);
             }
          }
          q.c(uArrayList, b.a);
          k.p(uArrayList, String.valueOf(ta.H), ta.J, ta.L.f(), 1, k.d(ta, false), ta);
       }
       return;
    }
    public boolean b(Object p0){
       if (!p0 instanceof Music) {
          return false;
       }
       if (p0.mShowed != null) {
          return false;
       }
       p0.mShowed = true;
       return true;
    }
}
