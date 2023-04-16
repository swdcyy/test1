package com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import androidx.appcompat.app.AppCompatDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import com.google.android.material.bottomsheet.a;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.DialogFragment;

public class BottomSheetDialogFragment extends AppCompatDialogFragment	// class@001658
{

    public void BottomSheetDialogFragment(){
       super();
    }
    public Dialog onCreateDialog(Bundle p0){
       return new a(this.getContext(), this.getTheme());
    }
}
