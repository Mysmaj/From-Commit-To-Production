package ch.hsr.mge.gadgeothek.contracts;

/**
 * Created by Mysmaj on 28.10.17.
 */

public interface RegisterContract {

    interface View {
        void attemptLogin();
        void resetErrors();
    }

    interface UserActionsListener {

    }
}
