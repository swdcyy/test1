package com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment$a;
import s2b.a;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import vpb.a;
import com.kuaishou.android.model.music.Music;
import java.util.Objects;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;
import com.yxcorp.gifshow.music.cloudmusic.search.b;
import com.google.gson.JsonObject;
import k2b.e0;
import jqb.k;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class SearchMusicFragment$a implements a	// class@002030
{
    public final SearchMusicFragment a;

    public void SearchMusicFragment$a(SearchMusicFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchMusicFragment$a.class, "1")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (!uoa.c() && uoa.a() != null) {
             uArrayList.add(uoa.a());
          }
       }
       SearchMusicFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(uArrayList, ta, SearchMusicFragment.class, "18")) {
          k.o(uArrayList, String.valueOf(ta.H), "", 1095, ta.J, ta.W, 1, ta.U.i2(), ta.U.h2(), null, ta);
       }
       return;
    }
    public boolean b(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchMusicFragment$a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!p0.c() && (p0.a() == null || p0.a().mShowed != null)){
          b = false;
       }else {
          p0.mShowed = true;
          b = true;
       }
       return b;
    }
}
