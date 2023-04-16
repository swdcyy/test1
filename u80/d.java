package u80.d;
import com.kwai.video.clipkit.mv.KwaiMvParam;
import java.lang.String;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.video.minecraft.model.nano.Minecraft$CropOptions;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import java.util.ArrayList;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kwai.FaceMagic.AE2.AE2Project;
import android.util.Pair;

public interface abstract d	// class@002d60
{

    boolean A();
    KwaiMvParam C();
    boolean E();
    void G(String p0,QMedia p1,String p2,boolean p3);
    boolean H();
    int I();
    Minecraft$CropOptions N(String p0);
    boolean S();
    List V(c p0,boolean p1);
    String Z(boolean p0);
    String a0(String p0);
    boolean c0();
    void close();
    EditorSdk2V2$VideoEditorProject e();
    EditorSdk2MvAsset e0(String p0);
    boolean g();
    int getErrorCode();
    String getGroupId();
    String getTemplateId();
    ArrayList h(String p0);
    KSTemplateDetailInfo k0();
    int q();
    AE2Project s();
    Pair z(String p0);
}
