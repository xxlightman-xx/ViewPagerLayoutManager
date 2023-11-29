package rouchuan.viewpagerlayoutmanager.rotate;

import com.leochuan.RotateLayoutManager;

import rouchuan.viewpagerlayoutmanager.BaseActivity;
import rouchuan.viewpagerlayoutmanager.Util;


public class RotateLayoutActivity extends BaseActivity<RotateLayoutManager, RotatePopUpWindow> {

    @Override
    protected RotateLayoutManager createLayoutManager() {
        return new RotateLayoutManager(this, Util.Dp2px(this, 10));
    }

    @Override
    protected RotatePopUpWindow createSettingPopUpWindow() {
        return new RotatePopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
