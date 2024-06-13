package yukams.app.background_locator_2.provider

import java.util.HashMap

interface LocationUpdateListener {
    fun onLocationUpdated(location: HashMap<Any, Any>?)
    fun onStatusChanged(provider:String?, status:Int?)
}