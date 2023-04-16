package android.support.v4.media.session.a;
import android.os.IInterface;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.CharSequence;
import java.util.List;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.String;
import android.os.Bundle;
import android.support.v4.media.session.ParcelableVolumeInfo;

public interface abstract a implements IInterface	// class@000404
{

    void B1(boolean p0);
    void C0(PlaybackStateCompat p0);
    void E1(boolean p0);
    void F1(CharSequence p0);
    void J0();
    void J1(int p0);
    void K0(List p0);
    void Q0();
    void n0(MediaMetadataCompat p0);
    void onEvent(String p0,Bundle p1);
    void p0(int p0);
    void r0(ParcelableVolumeInfo p0);
    void w0(Bundle p0);
}
