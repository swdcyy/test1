package com.yxcorp.gifshow.albumwrapper.filter.MiYouMediaSelectableFilter;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import r79.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.System;

public final class MiYouMediaSelectableFilter extends IMediaSelectableFilter	// class@001b55
{
    public final int interval;

    public void MiYouMediaSelectableFilter(int p0){
       super();
       this.interval = p0;
    }
    public int isDisplay(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MiYouMediaSelectableFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 instanceof QMedia && (System.currentTimeMillis() - (p0.mModified * (long)1000)) - (long)this.interval <= 0) {
          return 0;
       }
       return -404;
    }
}
