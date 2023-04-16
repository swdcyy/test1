package ai4.a;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.tax.TaxFarmingTipsDialog;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.KwaiDialogFragment;

public final class a implements View$OnClickListener	// class@000081
{
    public final TaxFarmingTipsDialog b;

    public void a(TaxFarmingTipsDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.dismiss();
    }
}
