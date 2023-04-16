package com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import java.io.Serializable;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter$a;
import nsd.u;
import java.lang.Object;
import r79.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.List;

public class IMediaSelectableFilter implements Serializable	// class@001ac1
{
    public static final IMediaSelectableFilter$a Companion;

    static {
       IMediaSelectableFilter.Companion = new IMediaSelectableFilter$a(null);
    }
    public void IMediaSelectableFilter(){
       super();
    }
    public int isClickable(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMediaSelectableFilter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.q(p0, "media");
       return 0;
    }
    public int isDisplay(c p0){
       return 0;
    }
    public int isSelectable(c p0,List p1){
       return 0;
    }
    public String nonselectableAlert(){
       return null;
    }
}
