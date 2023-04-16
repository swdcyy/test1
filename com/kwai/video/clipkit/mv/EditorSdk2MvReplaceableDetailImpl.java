package com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableDetailImpl;
import com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableDetail;
import com.kwai.video.clipkit.mv.MvReplaceableAreaDetail;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.video.clipkit.mv.ReplaceableAreaInfo;
import com.kwai.video.clipkit.mv.EditorSdk2MvReplaceableAreaInfoImpl;
import com.kwai.video.clipkit.mv.MvPhotoInfo;

public class EditorSdk2MvReplaceableDetailImpl implements EditorSdk2MvReplaceableDetail	// class@001ac6
{
    public MvReplaceableAreaDetail mDetail;

    public void EditorSdk2MvReplaceableDetailImpl(MvReplaceableAreaDetail p0){
       super();
       this.mDetail = p0;
    }
    public List getReplaceableAreas(){
       ArrayList obj = PatchProxy.apply(null, this, EditorSdk2MvReplaceableDetailImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       EditorSdk2MvReplaceableDetailImpl tmDetail = this.mDetail;
       if (tmDetail != null) {
          MvReplaceableAreaDetail replaceableA = tmDetail.replaceableAreaDetail;
          if (replaceableA != null) {
             Iterator iterator = replaceableA.iterator();
             while (iterator.hasNext()) {
                obj.add(new EditorSdk2MvReplaceableAreaInfoImpl(iterator.next()));
             }
          }
       }
       return obj;
    }
    public int getTime(){
       EditorSdk2MvReplaceableDetailImpl tmDetail = this.mDetail;
       if (tmDetail != null) {
          MvReplaceableAreaDetail info = tmDetail.info;
          if (info != null) {
             return info.time;
          }
       }
       return 0;
    }
}
