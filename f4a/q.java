package f4a.q;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.detail.plc.helper.i;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import android.app.Activity;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;

public final class q implements DialogInterface$OnClickListener	// class@0022b5
{
    public final i b;
    public final GameCenterDownloadParams$DownloadAction c;

    public void q(i p0,GameCenterDownloadParams$DownloadAction p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(DialogInterface p0,int p1){
       q tb = this.b;
       q tc = this.c;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f10081a) {
          i b = tb.b;
          b.mAction = tc;
          tb.c.gameDownload(tb.e, b);
       }
       return;
    }
}
