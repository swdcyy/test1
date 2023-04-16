package com.yxcorp.gifshow.edit.draft.model.DraftFileManager$b;
import kud.d;
import java.util.List;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;

public class DraftFileManager$b implements d	// class@001aea
{
    public final List b;

    public void DraftFileManager$b(List p0){
       this.b = p0;
       super();
    }
    public boolean accept(File p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, DraftFileManager$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          if ((p0.getAbsolutePath()).startsWith(obj.next())) {
             break ;
          }
       }
       return false;
    }
    public boolean accept(File p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, DraftFileManager$b.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       Iterator iterator = this.b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if ((p0.getAbsolutePath()).startsWith(iterator.next())) {
             break ;
          }
       }
       return false;
    }
}
