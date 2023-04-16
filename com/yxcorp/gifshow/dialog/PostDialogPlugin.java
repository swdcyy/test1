package com.yxcorp.gifshow.dialog.PostDialogPlugin;
import tkd.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.dialog.PostDialogPlugin$DialogScenario;
import java.lang.Runnable;
import android.view.View;
import u07.t$a;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.util.List;
import kotlin.Pair;
import a17.c$a;

public interface abstract PostDialogPlugin implements b	// class@001a99
{

    boolean Ku(Fragment p0,PostDialogPlugin$DialogScenario p1,Runnable p2,View p3);
    void NE(t$a p0);
    PopupInterface$c YI();
    void dn(t$a p0);
    PopupInterface$c kp();
    void l00(t$a p0);
    void lV(t$a p0,PostDialogPlugin$DialogScenario p1);
    Pair sl(List p0,PostDialogPlugin$DialogScenario p1);
    void xB(c$a p0,PostDialogPlugin$DialogScenario p1);
}
