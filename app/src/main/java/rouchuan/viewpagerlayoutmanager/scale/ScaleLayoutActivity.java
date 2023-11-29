package rouchuan.viewpagerlayoutmanager.scale;

import com.leochuan.ScaleLayoutManager;

import rouchuan.viewpagerlayoutmanager.BaseActivity;
import rouchuan.viewpagerlayoutmanager.Util;


public class ScaleLayoutActivity extends BaseActivity<ScaleLayoutManager, ScalePopUpWindow> {

    @Override
    protected ScaleLayoutManager createLayoutManager() {
        return new ScaleLayoutManager(this, Util.Dp2px(this, 10));
    }

    @Override
    protected ScalePopUpWindow createSettingPopUpWindow() {
        return new ScalePopUpWindow(this, getViewPagerLayoutManager(), getRecyclerView());
    }
}
