package com.yxcorp.gifshow.album.selected.interact.MediaFilterList;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.album.selected.IMediaSelectableFilter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Set;
import r79.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.Ref$IntRef;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.List;

public final class MediaFilterList implements Serializable	// class@001ac5
{
    public Set filters;
    public String nonselectableAlert;

    public void MediaFilterList(){
       super();
    }
    public final void add(IMediaSelectableFilter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MediaFilterList.class, "1")) {
          return;
       }
       a.q(p0, "_a");
       if (this.filters == null) {
          this.filters = new CopyOnWriteArraySet();
       }
       MediaFilterList tfilters = this.filters;
       if (tfilters != null) {
          tfilters.add(p0);
       }
       return;
    }
    public final Set getFilters(){
       return this.filters;
    }
    public final String getNonselectableAlert(){
       return this.nonselectableAlert;
    }
    public final int isClickable(c p0){
       Ref$IntRef obj = PatchProxy.applyOneRefs(p0, this, MediaFilterList.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.q(p0, "media");
       this.nonselectableAlert = null;
       obj = new Ref$IntRef();
       MediaFilterList tfilters = this.filters;
       if (tfilters != null) {
          Iterator iterator = tfilters.iterator();
          while (iterator.hasNext()) {
             IMediaSelectableFilter iMediaSelect = iterator.next();
             int i = iMediaSelect.isClickable(p0);
             obj.element = i;
             if (i) {
                this.nonselectableAlert = iMediaSelect.nonselectableAlert();
                return obj.element;
             }
          }
       }
       return 0;
    }
    public final int isDisplay(c p0){
       Ref$IntRef obj = PatchProxy.applyOneRefs(p0, this, MediaFilterList.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Ref$IntRef();
       MediaFilterList tfilters = this.filters;
       if (tfilters != null) {
          Iterator iterator = tfilters.iterator();
          while (iterator.hasNext()) {
             int i = iterator.next().isDisplay(p0);
             obj.element = i;
             if (i) {
                return i;
             }
          }
       }
       return 0;
    }
    public final int isSelectable(c p0,List p1){
       Ref$IntRef obj = PatchProxy.applyTwoRefs(p0, p1, this, MediaFilterList.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.nonselectableAlert = null;
       obj = new Ref$IntRef();
       MediaFilterList tfilters = this.filters;
       if (tfilters != null) {
          Iterator iterator = tfilters.iterator();
          while (iterator.hasNext()) {
             IMediaSelectableFilter iMediaSelect = iterator.next();
             int i = iMediaSelect.isSelectable(p0, p1);
             obj.element = i;
             if (i) {
                this.nonselectableAlert = iMediaSelect.nonselectableAlert();
                return obj.element;
             }
          }
       }
       return 0;
    }
}
