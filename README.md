# OceanFleet Vessel Management System

A Java-based console application for managing vessel performance records using Object-Oriented Programming (OOP) principles and the Java Collections Framework.

The application supports storing vessel details, retrieving vessels by ID, and identifying high-performance vessels based on their average speed.

## Use Case 1: Create Vessel Model

### Description
Creates a `Vessel` model class to represent vessel information, including vessel ID, vessel name, average speed, and vessel type. The class demonstrates encapsulation using private instance variables, constructors, and getter/setter methods.

## Use Case 2: Store Vessel Records Using List

### Description
Implements the `VesselUtil` class to manage multiple vessel performance records using Java Collections. The class maintains a private `List<Vessel>` and provides an `addVesselPerformance()` method to add vessel objects dynamically using an `ArrayList`.

## Use Case 3: Retrieve Vessel by Vessel ID

### Description
Implements the `getVesselById()` method in the `VesselUtil` class to search for a vessel using its unique vessel ID. The method performs a case-sensitive linear search through the vessel list and returns the matching `Vessel` object or `null` if no match is found.

## Use Case 4: Identify High-Performance Vessels

### Description
Implements the `getHighPerformanceVessels()` method in the `VesselUtil` class to identify vessels with the highest average speed. The method traverses the vessel list to determine the maximum speed and returns all vessels matching that speed, including multiple vessels in the case of a tie.

## Use Case 5: Integrate User Interaction (Console App)

### Description
Implements the `UserInterface` class to accept vessel performance details through console input using `Scanner`. The program parses colon-separated vessel data, creates and stores `Vessel` objects using `VesselUtil`, retrieves vessels by their IDs, and displays all vessels with the highest average speed.
