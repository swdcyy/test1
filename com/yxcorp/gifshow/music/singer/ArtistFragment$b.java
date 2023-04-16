package com.yxcorp.gifshow.music.singer.ArtistFragment$b;
import hqb.b;
import com.yxcorp.gifshow.music.singer.ArtistFragment;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import la6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kuaishou.android.model.music.Music;
import com.kuaishou.android.model.music.MusicType;

public class ArtistFragment$b extends b	// class@002078
{
    public final ArtistFragment t;

    public void ArtistFragment$b(ArtistFragment p0,int p1){
       this.t = p0;
       super(p1);
    }
    public void M1(Object p0,List p1){
       this.h2(p0, p1);
    }
    public void d2(b p0,List p1){
       this.h2(p0, p1);
    }
    public void h2(MusicsResponse p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ArtistFragment$b.class, "1")) {
          return;
       }
       super.h2(p0, p1);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          Music mType = iterator.next().mType;
          if (mType == MusicType.LIP || mType == MusicType.SOUNDTRACK) {
             iterator.remove();
          }
       }
       return;
    }
}
