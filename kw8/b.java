package kw8.b;
import n3d.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import android.content.Intent;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import android.os.Parcelable;
import org.parceler.b;
import lnc.d4;
import lnc.r8;
import java.util.List;
import ei5.c;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.l;
import com.kwai.framework.model.feed.BaseFeed;
import vw8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.android.model.mix.w;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public final class b implements a	// class@002c28
{
    public final QPhoto b;
    public final boolean c;

    public void b(QPhoto p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Object[] objArray1;
       b tb = this.b;
       b tc = this.c;
       Object[] objArray = new Object[0];
       a.b().s("startActivityWithPhoto", "startActivityWithPhoto requestCode: "+p0+", resultCode: "+p1, objArray);
       if (p1 == -1) {
          QPhoto qPhoto = b.a(p2.getParcelableExtra("share_qphoto"));
          if (qPhoto != null) {
             d4.c(tb, qPhoto);
             tb.updatePostChange(qPhoto);
             r8 or8 = r8.a();
             int i = 0;
             while (true) {
                if (i < or8.a.size()) {
                   if ((or8.a.get(i).getPhotoId()).equals(qPhoto.getPhotoId())) {
                      or8.a.set(i, qPhoto);
                      objArray1 = new Object[0];
                      c.C().w("ReeditLocalRepo", "photo:"+qPhoto.getPhotoId()+" have, replace", objArray1);
                      if (qPhoto.getMusic() != null) {
                         objArray1 = new Object[0];
                         c.C().w("ReeditLocalRepo", "replace photo, music: "+qPhoto.getMusic().getDisplayName(), objArray1);
                      label_00dc :
                         RxBus.f.b(new l(qPhoto.mEntity));
                         if (!PatchProxy.applyVoid(null, null, a.class, "59")) {
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = "SHOW_REEDIT_UPLOAD_SUCCESS";
                            u1.u0(10, uElementPack, null);
                         }
                         if (tc != null && !w.s0(qPhoto)) {
                            i.d(R.style.arg_RES_7f110669, a1.p(R.string.arg_RES_7f104227));
                            break ;
                         }else {
                            i.d(R.style.arg_RES_7f110669, a1.p(R.string.arg_RES_7f100f13));
                            break ;
                         }
                      }else {
                         goto label_00dc ;
                      }
                   }else {
                      i++;
                   }
                }else {
                   or8.a.add(qPhoto);
                   objArray1 = new Object[0];
                   c.C().w("ReeditLocalRepo", "add photo "+qPhoto.getPhotoId(), objArray1);
                   goto label_00dc ;
                }
             }
          }
       }
       return;
    }
}
