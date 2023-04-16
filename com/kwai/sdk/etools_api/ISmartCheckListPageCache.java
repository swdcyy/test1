package com.kwai.sdk.etools_api.ISmartCheckListPageCache;
import com.kwai.sdk.etools_api.FragmentListPageData;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public interface abstract ISmartCheckListPageCache	// class@00142f
{

    FragmentListPageData getFragmentListPageData();
    void onFragmentListShowing(Fragment p0,RecyclerView p1);
}
