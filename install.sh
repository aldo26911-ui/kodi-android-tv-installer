#!/bin/bash

# This script automatically installs and configures Kodi with TVHeadend for Android TV

# Update package list
sudo apt update

# Install Kodi
sudo apt install -y kodi

# Install TVHeadend
sudo apt install -y tvheadend

# Configure TVHeadend (example configuration)
# Assumes you have a sources.list for your channels defined

echo "Configuring TVHeadend..."
sudo systemctl start tvheadend
sudo systemctl enable tvheadend

# Output installation completion message
echo "Kodi and TVHeadend have been installed and configured!"