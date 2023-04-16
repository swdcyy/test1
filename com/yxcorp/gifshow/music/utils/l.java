package com.yxcorp.gifshow.music.utils.l;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import com.yxcorp.gifshow.music.utils.m;
import java.util.ArrayList;
import java.util.Collection;
import lnc.p3;
import java.lang.String;
import q87.c;
import kob.h;
import java.util.Iterator;
import com.kwai.feature.post.api.music.data.HistoryMusic;
import com.kuaishou.android.model.music.Music;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.music.data.MusicHistoryRecord;
import com.kuaishou.android.model.music.MusicType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kqb.v;
import java.lang.Runnable;
import t45.c;

public final class l implements o	// class@0020a1
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       Map map = m.d();
       ArrayList uArrayList = new ArrayList(map.values());
       boolean b = true;
       if (p0.isEmpty()) {
          Object[] objArray = new Object[0];
          p3.D().w("MusicHistoryUtils", "no old history .", objArray);
          h.a(b);
       }else {
          ArrayList uArrayList1 = new ArrayList();
          p0 = p0.iterator();
          while (p0.hasNext()) {
             HistoryMusic historyMusic = p0.next();
             if (map.size() >= m.i) {
                break ;
             }else if(map.containsKey(historyMusic.mMusic.mId)){
                continue ;
             }else {
                Object[] objArray2 = new Object[0];
                p3.D().w("MusicHistoryUtils", "move old history : "+historyMusic.mMusic.mId, objArray2);
                MusicHistoryRecord musicHistory = new MusicHistoryRecord();
                HistoryMusic mMusic = historyMusic.mMusic;
                musicHistory.mMusicId = mMusic.mId;
                musicHistory.mMusicType = mMusic.mType.getValue();
                musicHistory.mUseTime = historyMusic.mLastUseTime;
                uArrayList.add(musicHistory);
                map.put(musicHistory.mMusicId, musicHistory);
                if (uArrayList1.size() < 20) {
                   uArrayList1.add(historyMusic);
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList1, null, m.class, "5")) {
             c.a(new v(uArrayList1));
          }
          h.a(b);
          h.b(map);
          Object[] objArray1 = new Object[0];
          p3.D().w("MusicHistoryUtils", "end loadMusicHistoryList : "+map.size(), objArray1);
       }
       return uArrayList;
    }
}
