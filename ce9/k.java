package ce9.k;
import uyb.m;
import com.yxcorp.gifshow.camera.record.magic.e$a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import tkd.b;
import tkd.d;
import om6.r;

public final class k implements m	// class@0005c7
{
    public final e$a a;

    public void k(e$a p0){
       this.a = p0;
    }
    public final int getRecordDuration(){
       int recordDurati = this.a.b.d.b().getRecordDuration();
       if (recordDurati > 0) {
       }else {
          recordDurati = d.a(-831446984).uK(0);
       }
       return recordDurati;
    }
}
