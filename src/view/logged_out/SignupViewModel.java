package view.logged_out;

import view.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SignupViewModel extends ViewModel {

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);
    public final SignupViewState state;

    public SignupViewModel(String viewName, SignupViewState state) {
        super(viewName);
        this.state = state;
    }

    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
