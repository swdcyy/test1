package com.yxcorp.gifshow.album.home.AlbumAssetFragment$j;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import jlb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import q79.d;
import java.util.List;
import a79.a;
import r79.a;
import w69.k;
import java.lang.Integer;
import java.lang.Number;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Long;

public final class AlbumAssetFragment$j implements Observer	// class@0019dd
{
    public final AlbumAssetFragment b;

    public void AlbumAssetFragment$j(AlbumAssetFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment$j.class, "1")) {
       }else {
          String str = "AlbumAssetFragment";
          if (p0 == null) {
             Log.g(str, "change album, album=null");
          }else if(a.g(p0, this.b.S)){
             Log.g(str, "change album, album == mCurrentAlbum == "+p0);
          }else {
             AlbumAssetFragment$j tb = this.b;
             tb.S = p0;
             List list = tb.rh().H0(this.b.nh(), this.b.mh());
             if (list != null) {
                Log.g(str, "onAlbumChanged, album="+p0+", list="+list);
                AlbumAssetFragment.ch(this.b).l1(list);
                AlbumAssetFragment.ch(this.b).Y0();
                p0 = this.b.rh().s0().m().x();
                if (p0 != null) {
                   int i = p0.intValue();
                   AlbumAssetFragment$j tb1 = this.b;
                   ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      uArrayList.add(Long.valueOf(iterator.next().mModified));
                   }
                   tb1.th(i, uArrayList);
                }
                this.b.Kh();
             }
          }
       }
       return;
    }
}
