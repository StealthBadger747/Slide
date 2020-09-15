package me.ccrama.redditslide.Fragments;

import android.app.Activity;
import android.widget.CompoundButton;

import androidx.appcompat.widget.SwitchCompat;

import me.ccrama.redditslide.R;
import me.ccrama.redditslide.SettingValues;

public class SettingsPrivacyFragment {

    private Activity context;

    public SettingsPrivacyFragment(Activity context) {
        this.context = context;
    }

    public void Bind() {
        {
            SwitchCompat single = context.findViewById(R.id.settings_comments_commentnav);
            single.setChecked(SettingValues.fastscroll);
            single.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    SettingValues.fastscroll = isChecked;
                    SettingValues.prefs.edit().putBoolean(SettingValues.PREF_FASTSCROLL, isChecked).apply();
                }
            });
        }
        SwitchCompat check = context.findViewById(R.id.settings_comments_swapGesture);
        check.setChecked(SettingValues.swap);
        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SettingValues.swap = isChecked;
                SettingValues.prefs.edit().putBoolean(SettingValues.PREF_SWAP, isChecked).apply();
            }
        });
    }

}
