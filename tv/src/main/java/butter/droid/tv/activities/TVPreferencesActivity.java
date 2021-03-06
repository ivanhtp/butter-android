/*
 * This file is part of Butter.
 *
 * Butter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Butter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Butter. If not, see <http://www.gnu.org/licenses/>.
 */

package butter.droid.tv.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v17.leanback.app.GuidedStepFragment;

import butter.droid.tv.TVButterApplication;
import butter.droid.tv.activities.base.TVBaseActivity;
import butter.droid.tv.ui.preferences.TVPreferencesFragment;

public class TVPreferencesActivity extends TVBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TVButterApplication.getAppContext()
                .getComponent()
                .inject(this);

        super.onCreate(savedInstanceState);
        GuidedStepFragment.addAsRoot(this, new TVPreferencesFragment(), android.R.id.content);
    }

    public static Intent startActivity(Activity activity) {
        Intent intent = new Intent(activity, TVPreferencesActivity.class);
        activity.startActivity(intent);
        return intent;
    }
}
