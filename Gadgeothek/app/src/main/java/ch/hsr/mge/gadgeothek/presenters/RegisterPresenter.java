package ch.hsr.mge.gadgeothek.presenters;

import ch.hsr.mge.gadgeothek.contracts.RegisterContract;

/**
 * Created by Mysmaj on 28.10.17.
 */

public class RegisterPresenter implements RegisterContract.UserActionsListener {

    private RegisterContract.View view;

    public RegisterPresenter(RegisterContract.View view) {
        this.view = view;
    }


}
