# Design Parking Lot

## Initial Requirements Gathering:
- Parking lot will be having multiple floors.
- There is an entry at parking lot
- There will be multiple entry gates but one floor will be having only one entry gate.
- A ticket is given at entry gate to each vehicle.
- Ticket contains information: Vehicle Number, Entry Time, Type of the vehicle, Assigned Parking Spot Number
- Different vehicle type will have different parking spots
- Entry gate will be having an attendant
- Parking spots might be having some properties depending upon their type. E.g.
  - EV vehicle type will be having charger
  - Luxury vehicle type will be having additional security
- Exit gate present for vehicle to exit
- There can be multiple exit gate available, but for one floor only one exit gate will be available
- Attendant will be present at exit gate
- Ticket is given to attendant and bill will be generated
- Payment for bill can be done via multiple modes
  - Cash
  - UPI
  - Credit/Debit Cards
  - FastTag

### Spot Allocation Strategy
This is for how to allocate spots to the vehicle from available slots.

1. Allocate Randomly
2. Allocate Serially
3. Allocate closest to gate

### Bill Generation Strategy
Bill should be generated based on time and type of vehicle.

Total amount = Base Rate based on Vehicle Type + (Total Hours * Hourly Rate)






