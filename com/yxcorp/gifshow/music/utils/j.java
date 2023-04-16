package com.yxcorp.gifshow.music.utils.j;
import erd.o;
import java.util.List;
import java.lang.Object;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.music.data.MusicHistoryRecord;
import com.kuaishou.android.model.music.MusicType;
import java.lang.String;
import lnc.p3;
import q87.c;
import a46.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import kqb.s;
import brd.t;
import wkd.b;
import kqb.e;
import com.yxcorp.gifshow.music.utils.k;
import kqb.q;
import brd.w;
import erd.c;

public final class j implements o	// class@002097
{
    public final List b;

    public void j(List p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       StringBuilder str = "";
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = tb.iterator();
       while (iterator.hasNext()) {
          MusicHistoryRecord musicHistory = iterator.next();
          if (musicHistory.mMusicType == MusicType.LOCAL.getValue()) {
             uArrayList.add(musicHistory.mMusicId);
          }else {
             str = str+musicHistory.mMusicId+"$"+musicHistory.mMusicType+",";
          }
       }
       if (str.length() > 0) {
          str.deleteCharAt((str.length() - 1));
       }
       Object[] objArray = new Object[0];
       p3.D().w("MusicHistoryUtils", "local size : "+uArrayList.size()+"  total size : "+p0.size(), objArray);
       p0 = y6.s(d.class, LoadPolicy.SILENT_IMMEDIATE).w(new s(uArrayList));
       t ot = (!str.length())? t.just(new ArrayList()): b.a(0x2e5dfb95).d(str).map(k.b);
       return t.zip(p0, ot, new q(tb));
    }
}
